# Generic List

Java'da generic yapısını kullanarak verileri tuttuğumuz bir sınıf tasarlıyoruz.

Sınıfın amacı içerisinde dinamik bir Array (Dizi) tutması ve veri tipini dinamik olarak alması. Bunun için generic bir sınıf oluşturuldu.

Sınıf özellikleri :



- Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı ihtiyaç duydukça 2 katı şeklinde artmalı.


- Sınıfa ait iki tür constructor metot bulunmalı


- MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.


- MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır.


- size() : dizideki eleman sayısını verir.


- getCapacity() : dizinin kapasite değerini verir.


- add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır.
