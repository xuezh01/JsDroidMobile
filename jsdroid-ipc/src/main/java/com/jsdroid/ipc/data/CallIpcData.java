package com.jsdroid.ipc.data;


import java.io.IOException;
import java.util.Arrays;


public class CallIpcData implements IpcData {
    public String name;
    public long id;
    public String methodName;
    public Object params[];
    public String paramTypes[];

    @Override
    public void write(Output output) throws IOException {
        output.write(id);
        output.write(name);
        output.write(methodName);
        output.write(paramTypes);
        output.write(params);
    }

    @Override
    public void read(Input input) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        id = input.read();
        name = input.read();
        methodName = input.read();
        paramTypes = input.read();

        params = input.read();

    }

    @Override
    public String toString() {
        return "CallIpcData{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", methodName='" + methodName + '\'' +
                ", params=" + Arrays.toString(params) +
                ", paramTypes=" + Arrays.toString(paramTypes) +
                '}';
    }
}
