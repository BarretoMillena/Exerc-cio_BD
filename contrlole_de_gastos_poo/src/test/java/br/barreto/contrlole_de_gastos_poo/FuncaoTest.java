/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.barreto.contrlole_de_gastos_poo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class FuncaoTest {
    
    public FuncaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isAcessoRestrito method, of class Funcao.
     */
    @org.junit.Test
    public void testIsAcessoRestrito() {
        System.out.println("isAcessoRestrito");
        Funcao instance = new Funcao();
        boolean expResult = false;
        boolean result = instance.isAcessoRestrito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAcessoRestrito method, of class Funcao.
     */
    @org.junit.Test
    public void testSetAcessoRestrito() {
        System.out.println("setAcessoRestrito");
        boolean acessoRestrito = false;
        Funcao instance = new Funcao();
        instance.setAcessoRestrito(acessoRestrito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Funcao.
     */
    @org.junit.Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Funcao instance = new Funcao();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Funcao.
     */
    @org.junit.Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        Funcao instance = new Funcao();
        instance.setDescricao(descricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Funcao.
     */
    @org.junit.Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Funcao instance = new Funcao();
        Integer expResult = null;
        Integer result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Funcao.
     */
    @org.junit.Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        Integer codigo = null;
        Funcao instance = new Funcao();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
