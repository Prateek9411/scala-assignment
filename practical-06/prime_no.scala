class Prime
{
	def check(arg:Int):Boolean=
	{
		var i=2
		while(i<arg/2)
		{
			if(arg%i==0)
			{
				return false
			}
			i+=1
		}
		return true
	}
}
object findit
{
	def main(args: Array[String])
	{
		var num:Int=0
		var result:Boolean=true
		print("Enter anumber: ")
		num=scala.io.StdIn.readInt()

		val obj=new Prime()
		result=obj.check(num)
		if(result==true)
		{
			println(num+" is a prime number")
		}
		else
		{
			println(num+" is not a prime number")
		}
	}
}