package com.ilegra.treinamento.xp.christophe.todo.list;

import java.util.Scanner;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

public class Main {

	public static void main(String[] args) {
		Mongo m = null;
		try {
			m = new Mongo();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		DB db = m.getDB( "todo_list_db" );
		
		while(true){
			Scanner scanner = new Scanner(System.in);
			int option = 0;
			System.out.println("Welcome to the todo list");
			System.out.println("Choose one of the following option:");
			System.out.println("1. Add a task");
			System.out.println("2. Print tasks");
			System.out.println("3. Complete task");
			System.out.println("4. Delete task");
			System.out.println("5. Quit");
			System.out.println("Option:");
			option = scanner.nextInt();
			
			if(option == 1){
				System.out.println("Task Name");
				String taskName = scanner.next();
				DBCollection collection = db.getCollection("task");
				BasicDBObject task = new BasicDBObject();
				task.put("nome", taskName);
				task.put("status", "IN PROGRESS");
				collection.insert(task);
				System.out.println("OK");
			}
			
			if(option == 2){
				DBCollection collection = db.getCollection("task");
				DBCursor cur = collection.find();
				
				while(cur.hasNext()) {
					DBObject task = cur.next();
					System.out.println(task.get("nome") + " - " + task.get("status") );
				}
			}
			
			if(option == 3){
				System.out.println("Task Name");
				String taskName = scanner.next();
				DBCollection collection = db.getCollection("task");
				
				BasicDBObject query = new BasicDBObject();

				query.put("nome", taskName );

				DBCursor cur =  collection.find(query);
				
				while(cur.hasNext()) {
					DBObject task = cur.next();
					task.put("status", "DONE");
					collection.update(query, task);
					
				}

			}
			
			
			if(option == 4){
				System.out.println("Task Name");
				String taskName = scanner.next();
				DBCollection collection = db.getCollection("task");
				
				BasicDBObject query = new BasicDBObject();

				query.put("nome", taskName );

				DBCursor cur =  collection.find(query);
				
				while(cur.hasNext()) {
					DBObject task = cur.next();
					collection.remove(task);
				}
			}
			
			if(option == 5){
				System.exit(0);
			}
		}
	}
	
	
}
