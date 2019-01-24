package com.ns.test;

import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import com.springinaction.knights.BraveKnight;
import com.springinaction.knights.Quest;

public class BravaKnightTest {

  @Test
  public void KnightShould(){
    Quest quest=PowerMockito.mock(Quest.class);
    BraveKnight braveKnight=new BraveKnight(quest);
    braveKnight.embarkOnquest();
  }
  
}
