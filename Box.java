class Box{
double width;
double height;
double depth;
Box(Box ob){
width=ob.width;
heigt=ob.height;
depth=ob.depth;
}
Box(double w,double h,double d){
width=w;
height=h;depth=d;
}
Box(){
width=-1;
height=-1;
depth=-1;
}
Box(double len){
width=height=depth=len;
}
double volume(){
return width*height*depth;
}
class BoxWeight extends Box{
double weight;
BoxWeight(ob){
super(ob);
weight=ob.weight;
}
BoxWeight(double w,double h,double d,double m)
super(w,h,d);
weight=m
BoxWeight()
super();
weight=-1;
}
}
