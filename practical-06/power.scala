import scala.math.pow
class Math
{
	var powTwo: Double=1
	var powThree: Double=1
	var powFour: Double=1
	def findPower(arg:Int)
	{
		var i=1
		var res=1
		while(i<5)
		{
			res=res*arg
			if(i==2||i==3||i==4)
			{
				show(res,i,arg)
			}
			i+=1
		}
	}
	def show(res:Int,i:Int,arg:Int)
	{
		println(arg+" to the power "+i+" value is: "+res)
	}
	def preDefinedMethod(arg:Int)
	{
		powTwo=scala.math.pow(arg,2)
		powThree=scala.math.pow(arg,3)
		powFour=scala.math.pow(arg,4)
		println("using inbuilt library function:-")
		println(arg+" to the power "+2+" value is: "+powTwo)
		println(arg+" to the power "+3+" value is: "+powThree)
		println(arg+" to the power "+4+" value is: "+powFour)
	}
}
object power
{
	def main(args: Array[String])
	{
		var num:Int=0
		print("Enter anumber: ")
		num=scala.io.StdIn.readInt()

		val obj =new Math()
		obj.findPower(num)
		obj.preDefinedMethod(num)
	}
}