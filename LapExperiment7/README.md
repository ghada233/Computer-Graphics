>pic example
>![image](https://user-images.githubusercontent.com/70041510/181070559-cd6f8daa-17f8-4ecf-b04f-da77f68adfd1.png)

### code :

Some basic  commands are:
```
  Random r = new Random();
         int n =10;
         int x []={150, 180,200,220,250,220,250,200,180,180};
         int y[]={140,130,100,130,140,160,200,180, 200 ,160};
         for(int i=0; i<20; i++){
             
     g2d.translate(200, -200);
     g2d.rotate(Math.toRadians(50));
     g2d.setPaint(new Color( r.nextInt(254),  r.nextInt(254),  r.nextInt(254),  r.nextInt(254)));
     g2d.fillPolygon(x, y, n); 
     
```
