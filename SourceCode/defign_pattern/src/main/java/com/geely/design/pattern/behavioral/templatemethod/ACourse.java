package com.geely.design.pattern.behavioral.templatemethod;

public abstract class ACourse {

    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if(needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }
    //通用的内容添加final写死
    final void makePPT(){
        System.out.println("制作PPT");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }

    void writeArticle(){
        System.out.println("编写手记");
    }

    //钩子方法
    protected boolean needWriteArticle(){
        return false;
    }

    abstract void packageCourse();
}
