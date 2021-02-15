# MediaSorter
## 1. 背景
有一些广场舞机器，u盘视频歌曲播放的时候是按默认排序的。这样的话想要修改歌曲排序非常麻烦。 为了解决这个问题，我写了一个小demo来批量统一文件的存入时间，达到自定义视频排序的目的。
## 2. 我的小插曲
一开始我把广场舞视频复制到u盘当中，发现新的歌曲在跳舞机上是排在最后面的。然后我就断定u盘默认排序是按照时间来排序的。一般我们windows用的文件排序有，按时间（时间修改日期），大小，类型，名称。我就兴冲冲得写了一个修改时间日期的demo，但发现没有用。最后u盘排序是根据文件的进入时间来排，也就是哪个文件先进入u盘，哪个就排前面。
## 2. 下载
由于要照顾没有安装过jdk的同学，所以把jre也放进里面了。
链接：https://pan.baidu.com/s/1ShL3A4m8wfSaGWxGF_nWeQ 
提取码：h1mq 
## 3. 使用方法
1. 将executor复制进广场舞文件中
![ ](https://upload-images.jianshu.io/upload_images/21680686-18202c4b178de3ba.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

2. 点击TimeModifier.exe，会在sort.txt中显示当前所有广场舞
![image.png](https://upload-images.jianshu.io/upload_images/21680686-87ff8afdeef0c2ec.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

3. 修改sort.txt中的顺序
![image.png](https://upload-images.jianshu.io/upload_images/21680686-bdf5d5f6c46016d4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

4. 再一次点击FileSorter.exe
5. 完成
![image.png](https://upload-images.jianshu.io/upload_images/21680686-ea8a773ae18d5de3.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
## 3. [github源码](https://github.com/Teskinfly/MediaSorter)
