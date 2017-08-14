/*
 * Copyright © 2017 Ticomm and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.ticomm.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.NotificationService;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.yang.binding.NotificationListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PackethandlerservProvider {

    private static final Logger LOG = LoggerFactory.getLogger(PackethandlerservProvider.class);

    private final DataBroker dataBroker;
    private final NotificationService notificationService;
    private ListenerRegistration<NotificationListener> registration;

    public PackethandlerservProvider(final DataBroker dataBroker,
    								 final NotificationService notificationService) {
        this.dataBroker = dataBroker;
        this.notificationService = notificationService;
    }

    /**
     * Method called when the blueprint container is created.
     */
    public void init() {
    	System.out.println("Enter packet hanler...");
    	PacketHandler packetHandler = new PacketHandler();
    	registration = this.notificationService.registerNotificationListener(packetHandler);
    	System.out.println("Packet process is over.");
        LOG.info("PackethandlerservProvider Session Initiated");
    }

    /**
     * Method called when the blueprint container is destroyed.
     */
    public void close() {
    	registration.close();
        LOG.info("PackethandlerservProvider Closed");
    }
}