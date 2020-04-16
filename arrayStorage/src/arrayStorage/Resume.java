package arrayStorage;

import java.util.UUID;

public class Resume {
	String name;
	UUID id;
	int age;
	int experience;

	public Resume(String s, int a, int e) {
		name = s;
		age = a;
		experience = e;
		id = UUID.randomUUID();
	}
//	public String save ()
//	{}
	
	public String getName() {
		String resumeStr = this.name;
		return resumeStr;
	}
//	public resume get (UUID id)
//	{}

	@Override
	public String toString() {
		return "" + name + " " + age + " " + experience;
	}

//	public delete ()
//	{}
//	public size ()
//	{}
//	public clear()
//	{}
//	public getAll()
//	{
//	String str = this.toString();
//		
//	}

}
