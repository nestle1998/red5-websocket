/*
 * RED5 Open Source Flash Server - http://code.google.com/p/red5/
 * 
 * Copyright 2006-2014 by respective authors (see below). All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.red5.net.websocket.model;

import org.apache.mina.core.buffer.IoBuffer;

/**
 * Defines the class whose objects are understood by websocket encoder.
 * 
 * @author Dhruv Chopra
 * @author Paul Gregoire
 */
public class Packet {
	
    private final IoBuffer data;
    
    private Packet(byte[] buf) {
    	this.data = IoBuffer.wrap(buf);
    }

    /**
     * Returns the data.
     * 
     * @return data
     */
    public IoBuffer getData(){
        return data;
    }

    /**
     * Builds the packet which just wraps the IoBuffer.
     * 
     * @param buf
     * @return packet
     */
    public static Packet build(byte[] buf) {
        return new Packet(buf);
    }

    /**
     * Builds the packet which just wraps the IoBuffer.
     * 
     * @param buffer
     * @return packet
     */
    public static Packet build(IoBuffer buffer) {
        return new Packet(buffer.array());
    }
        
}
