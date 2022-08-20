package Generalization;

public class zTestGeneralization
{
public static void main(String[] args)
{
System.out.println("---------Properties of Jio------------");
xJio j = new xJio();
j.sms();
j.internet();
j.newFeatureA();

System.out.println("---------Properties of VI------------");
xVI v =new xVI();
v.sms();
v.internet();
v.newFeatureB();

System.out.println("---------Properties of Airtel------------");
xAirtel a = new xAirtel();
a.sms();
a.internet();
a.newFeatureC();
}
}
