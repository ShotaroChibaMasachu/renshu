public class Sample
{
    public static void main( String[] args )
    {
        try
        {
            // DataUseSuper�N���X�̎g�p��B

            // ���C���X�^���X�����܂��B
            DataUseSuper data = new DataUseSuper();
            data.setData( 100 );
            System.out.println( data.getData() );
            // 100

            // clone()���\�b�h�ŕ��������܂��B
            DataUseSuper dataCloned = (DataUseSuper)data.clone();

            // �o�͂��܂��B
            System.out.println( dataCloned.getData() );
            // 100
        }
        catch( CloneNotSupportedException e )
        {
            e.printStackTrace();
        }

        try
        {
            // DataNotCloneableImplemented�N���X�̎g�p��B

            // ���C���X�^���X�����܂��B
            DataNotCloneableImplemented data = new DataNotCloneableImplemented();
            data.setData( 200 );
            System.out.println( data.getData() );
            // 200

            // clone()���\�b�h�ŕ��������܂��B
            DataNotCloneableImplemented dataCloned = (DataNotCloneableImplemented)data.clone();
        }
        catch( CloneNotSupportedException e )
        {
            // DataNotCloneableImplemented�N���X�́ACloneable�C���^�[�t�F�C�X
            // �̎����N���X����Ȃ��̂ɁAObject�N���X��clone()���\�b�h��
            // ��������낤�Ƃ����̂ŁACloneNotSupportedException��O���������܂��B
            e.printStackTrace();
            // java.lang.CloneNotSupportedException: DataNotCloneableImplemented
            //     at java.lang.Object.clone(Native Method)
            //     at DataNotCloneableImplemented.clone(Sample.java:113)
            //     at Sample.main(Sample.java:39)
        }
    }
}

/**
*   Object�N���X��clone()���\�b�h���I�[�o�[���C�h���āA
*   Object�N���X��clone()���\�b�h���g�p���ĕ��������܂��B
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
    *   Object�N���X��clone()���\�b�h���I�[�o�[���C�h���܂��B
    */
    protected Object clone() throws CloneNotSupportedException
    {
        // Object�N���X��clone()���\�b�h�ŕ��������܂��B
        // Cloneable�C���^�[�t�F�C�X�̎����N���X�łȂ���
        // CloneNotSupportedException��O���������܂��B
        return super.clone();
    }
}

/**
*   Object�N���X��clone()���\�b�h���I�[�o�[���C�h���āA
*   Object�N���X��clone()���\�b�h���g�p���ĕ��������܂��B
*   �������ACloneable�C���^�[�t�F�C�X�̎����N���X�ł�
*   ����܂���i�܂�Ԉ������ł��j�B
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
    *   Object�N���X��clone()���\�b�h���I�[�o�[���C�h���܂��B
    */
    protected Object clone() throws CloneNotSupportedException
    {
        // Object�N���X��clone()���\�b�h�ŕ��������܂��B
        // �ł��ACloneable�C���^�[�t�F�C�X�̎����N���X�ł͂Ȃ��̂�
        // CloneNotSupportedException��O���������܂��B
        return super.clone();
    }
}