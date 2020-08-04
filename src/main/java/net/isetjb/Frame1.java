/*
 * The MIT License
 *
 * Copyright 2017 Nafaa Friaa (nafaa.friaa@isetjb.rnu.tn).
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.isetjb;

import net.isetjb.config.I18N;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

import org.apache.log4j.Logger;

/**
 * Frame1 class.
 *
 * @author Nafaa Friaa (nafaa.friaa@isetjb.rnu.tn)
 */
public class Frame1 extends JInternalFrame
{
    final static Logger log = Logger.getLogger(Frame1.class);

    JButton jButton1 = new JButton("Run");

    /**
     * Constructor.
     */
    public Frame1()
    {
        log.debug("START constructor...");

        setTitle(I18N.lang("frame1.title"));
//
//        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(480,450);
        setLocation(0, 0);


        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        //add compnent to the frame :
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));



        getContentPane().add(jButton1);
        log.debug("End of constructor.");
    }
}
