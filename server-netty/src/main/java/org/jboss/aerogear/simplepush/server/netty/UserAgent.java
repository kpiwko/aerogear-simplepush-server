/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.simplepush.server.netty;

import io.netty.channel.ChannelHandlerContext;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class UserAgent {
    
    private final UUID uaid;
    private final ChannelHandlerContext ctx;
    private AtomicLong timestamp;

    public UserAgent(final UUID uaid, final ChannelHandlerContext ctx, final long timestamp) {
        this.uaid = uaid;
        this.ctx = ctx;
        this.timestamp = new AtomicLong(timestamp);
    }
    
    public UUID uaid() {
        return uaid;
    }
    
    public ChannelHandlerContext context() {
        return ctx;
    }
    
    public long timestamp() {
        return timestamp.get();
    }
    
    public void timestamp(final long timestamp) {
        this.timestamp.set(timestamp);
    }
    
    @Override
    public String toString() {
        return "UserAgent[uaid=" + uaid + ", ctx=" + ctx + ", timestamp=" + timestamp() + "]";
    }

}
