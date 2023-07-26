package library.service;

import java.util.ArrayList;

import library.vo.Member;
import library.vo.Rent;
import library.vo.Thing;

public class LibraryService {
	private ArrayList<Thing> things = new ArrayList<Thing>();
	private ArrayList<Member> mems = new ArrayList<Member>();
	private ArrayList<Rent> rents = new ArrayList<Rent>();
	
	private int cnt =0;
	
	public void add(Member mb) throws 회원아이디중복Exception{
		for(Member m: mems) {
			if(m.getId().equals(mb.getId())) {
				throw new 회원아이디중복Exception();
			}
		}
		mems.add(mb);
	}

	public void add(Thing t) {
		things.add(t);
		cnt = cnt + t.getAmount();
	}

	public ArrayList<Member> findMemberByName(String name) {
		ArrayList<Member> searchList = new ArrayList<>();
		for(int i =0 ;i<mems.size(); i++) {
			if(mems.get(i).getName()== name) {
				searchList.add(mems.get(i));
			}
		}
		return searchList;
	}

	public ArrayList<Thing> findItemByTitle(String title) {
		ArrayList<Thing> searchList = new ArrayList<>();
		for(int i =0 ; i<things.size(); i++) {
			if(things.get(i).getTitle() == title) {
				searchList.add(things.get(i));
			}
		}
		return searchList;
	}
	
	 
	
	
		
	
}
