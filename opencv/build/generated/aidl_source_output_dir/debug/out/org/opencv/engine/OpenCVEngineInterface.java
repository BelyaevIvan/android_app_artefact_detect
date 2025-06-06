/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: C:\Users\dashilyan\AppData\Local\Android\Sdk\build-tools\35.0.0\aidl.exe -pC:\Users\dashilyan\AppData\Local\Android\Sdk\platforms\android-35\framework.aidl -oC:\Users\dashilyan\AndroidStudioProjects\ArtefactDetect\opencv\build\generated\aidl_source_output_dir\debug\out -IC:\Users\dashilyan\AndroidStudioProjects\ArtefactDetect\opencv\java\src -IC:\Users\dashilyan\AndroidStudioProjects\ArtefactDetect\opencv\src\debug\aidl -dC:\Users\DASHIL~1\AppData\Local\Temp\aidl4803170563691618386.d C:\Users\dashilyan\AndroidStudioProjects\ArtefactDetect\opencv\java\src\org\opencv\engine\OpenCVEngineInterface.aidl
 */
package org.opencv.engine;
/** Class provides a Java interface for OpenCV Engine Service. It's synchronous with native OpenCVEngine class. */
public interface OpenCVEngineInterface extends android.os.IInterface
{
  /** Default implementation for OpenCVEngineInterface. */
  public static class Default implements org.opencv.engine.OpenCVEngineInterface
  {
    /** @return Returns service version. */
    @Override public int getEngineVersion() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Finds an installed OpenCV library.
     * @param OpenCV version.
     * @return Returns path to OpenCV native libs or an empty string if OpenCV can not be found.
     */
    @Override public java.lang.String getLibPathByVersion(java.lang.String version) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Tries to install defined version of OpenCV from Google Play Market.
     * @param OpenCV version.
     * @return Returns true if installation was successful or OpenCV package has been already installed.
     */
    @Override public boolean installVersion(java.lang.String version) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * Returns list of libraries in loading order, separated by semicolon.
     * @param OpenCV version.
     * @return Returns names of OpenCV libraries, separated by semicolon.
     */
    @Override public java.lang.String getLibraryList(java.lang.String version) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.opencv.engine.OpenCVEngineInterface
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.opencv.engine.OpenCVEngineInterface interface,
     * generating a proxy if needed.
     */
    public static org.opencv.engine.OpenCVEngineInterface asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.opencv.engine.OpenCVEngineInterface))) {
        return ((org.opencv.engine.OpenCVEngineInterface)iin);
      }
      return new org.opencv.engine.OpenCVEngineInterface.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      if (code == INTERFACE_TRANSACTION) {
        reply.writeString(descriptor);
        return true;
      }
      switch (code)
      {
        case TRANSACTION_getEngineVersion:
        {
          int _result = this.getEngineVersion();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_getLibPathByVersion:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _result = this.getLibPathByVersion(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_installVersion:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.installVersion(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_getLibraryList:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _result = this.getLibraryList(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements org.opencv.engine.OpenCVEngineInterface
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /** @return Returns service version. */
      @Override public int getEngineVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getEngineVersion, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Finds an installed OpenCV library.
       * @param OpenCV version.
       * @return Returns path to OpenCV native libs or an empty string if OpenCV can not be found.
       */
      @Override public java.lang.String getLibPathByVersion(java.lang.String version) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(version);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getLibPathByVersion, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Tries to install defined version of OpenCV from Google Play Market.
       * @param OpenCV version.
       * @return Returns true if installation was successful or OpenCV package has been already installed.
       */
      @Override public boolean installVersion(java.lang.String version) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(version);
          boolean _status = mRemote.transact(Stub.TRANSACTION_installVersion, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Returns list of libraries in loading order, separated by semicolon.
       * @param OpenCV version.
       * @return Returns names of OpenCV libraries, separated by semicolon.
       */
      @Override public java.lang.String getLibraryList(java.lang.String version) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(version);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getLibraryList, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_getEngineVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getLibPathByVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_installVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getLibraryList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "org.opencv.engine.OpenCVEngineInterface";
  /** @return Returns service version. */
  public int getEngineVersion() throws android.os.RemoteException;
  /**
   * Finds an installed OpenCV library.
   * @param OpenCV version.
   * @return Returns path to OpenCV native libs or an empty string if OpenCV can not be found.
   */
  public java.lang.String getLibPathByVersion(java.lang.String version) throws android.os.RemoteException;
  /**
   * Tries to install defined version of OpenCV from Google Play Market.
   * @param OpenCV version.
   * @return Returns true if installation was successful or OpenCV package has been already installed.
   */
  public boolean installVersion(java.lang.String version) throws android.os.RemoteException;
  /**
   * Returns list of libraries in loading order, separated by semicolon.
   * @param OpenCV version.
   * @return Returns names of OpenCV libraries, separated by semicolon.
   */
  public java.lang.String getLibraryList(java.lang.String version) throws android.os.RemoteException;
}
