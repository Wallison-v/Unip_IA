package test;

import dao.InputInstance;
import entity.Table;
import resolver.State;

public class TestCompareStates {
	
	public static void main(String[] args) {
		Table t = InputInstance.getInstance("files/inst01.in");
		
		State s = new State(t);
		State oS = new State(t.getObjectiveTable());
		
		System.out.println("is Objective?");
		System.out.println(s);
		System.out.println(s.isObjective());

		System.out.println("is Objective?");
		System.out.println(oS);
		System.out.println(oS.isObjective());
	}
}