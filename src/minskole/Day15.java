package minskole;

public class Day15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D d = new D();
		
		d.a();
		d.e();
		d.f();
	}

}
interface A{
	public void a();
	public void b();
	public void c();
}
interface B{
	public void c();
	public void d();
	public void e();
}
interface C{
	public void e();
	public void f();
	public void g();
}

class D implements A, B, C{

	@Override
	public void f() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void g() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void e() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
}
