public class Sample
{
    public static void main( String[] args )
    {
        try
        {
            // DataUseSuperクラスの使用例。

            // 元インスタンスを作ります。
            DataUseSuper data = new DataUseSuper();
            data.setData( 100 );
            System.out.println( data.getData() );
            // 100

            // clone()メソッドで複製を作ります。
            DataUseSuper dataCloned = (DataUseSuper)data.clone();

            // 出力します。
            System.out.println( dataCloned.getData() );
            // 100
        }
        catch( CloneNotSupportedException e )
        {
            e.printStackTrace();
        }

        try
        {
            // DataNotCloneableImplementedクラスの使用例。

            // 元インスタンスを作ります。
            DataNotCloneableImplemented data = new DataNotCloneableImplemented();
            data.setData( 200 );
            System.out.println( data.getData() );
            // 200

            // clone()メソッドで複製を作ります。
            DataNotCloneableImplemented dataCloned = (DataNotCloneableImplemented)data.clone();
        }
        catch( CloneNotSupportedException e )
        {
            // DataNotCloneableImplementedクラスは、Cloneableインターフェイス
            // の実装クラスじゃないのに、Objectクラスのclone()メソッドで
            // 複製を作ろうとしたので、CloneNotSupportedException例外が投げられます。
            e.printStackTrace();
            // java.lang.CloneNotSupportedException: DataNotCloneableImplemented
            //     at java.lang.Object.clone(Native Method)
            //     at DataNotCloneableImplemented.clone(Sample.java:113)
            //     at Sample.main(Sample.java:39)
        }
    }
}

/**
*   Objectクラスのclone()メソッドをオーバーライドして、
*   Objectクラスのclone()メソッドを使用して複製を作ります。
*/
class DataUseSuper implements Cloneable
{
    private int data;

    public void setData( int i )
    {
        data = i;
    }

    public int getData()
    {
        return data;
    }

    /**
    *   Objectクラスのclone()メソッドをオーバーライドします。
    */
    protected Object clone() throws CloneNotSupportedException
    {
        // Objectクラスのclone()メソッドで複製を作ります。
        // Cloneableインターフェイスの実装クラスでないと
        // CloneNotSupportedException例外が投げられます。
        return super.clone();
    }
}

/**
*   Objectクラスのclone()メソッドをオーバーライドして、
*   Objectクラスのclone()メソッドを使用して複製を作ります。
*   ただし、Cloneableインターフェイスの実装クラスでは
*   ありません（つまり間違った例です）。
*/
class DataNotCloneableImplemented
{
    private int data;

    public void setData( int i )
    {
        data = i;
    }

    public int getData()
    {
        return data;
    }

    /**
    *   Objectクラスのclone()メソッドをオーバーライドします。
    */
    protected Object clone() throws CloneNotSupportedException
    {
        // Objectクラスのclone()メソッドで複製を作ります。
        // でも、Cloneableインターフェイスの実装クラスではないので
        // CloneNotSupportedException例外が投げられます。
        return super.clone();
    }
}