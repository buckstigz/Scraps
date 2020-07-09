package trivera.update.lambda.compare;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import trivera.update.lambda.compare.agenda.AgendaItem;
import trivera.update.lambda.compare.agenda.AgendaItemDAO;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Group, Inc.
 *
 * Copyright (c) 2019 Trivera Technologies, LLC. http://www.triveratech.com
 *
 * </p>
 *
 * @author Trivera Technologies Tech Team.
 */
public class LambdaCompare {

	public static void main(String[] args) {
		System.out.println("Exercise: Lambda.LambdaCompare");
		System.out.println("Type: solution-code");
		System.out.println("Java: " + System.getProperty("java.version"));

		//CODE1.1:Get list of randomized AgendaItems
        List<AgendaItem> agendaItems = AgendaItemsDAO.getAgendaItems();

		//CODE1.2:Define custom comparator using lambda notation
        Comparator<AgendaItem> comparator = (agenda1, agenda2) -> {
            if (agenda1 == null)
                return -1;
            if(agenda2 == null)
                return 1;

            return agenda1.getDateTime().compareTo(agenda2.getDateTime());
        };

		//CODE1.3:Print out UNSORTED AgendaItems
        System.out.println("Before sort: ");
        for (AgendaItem agendaItem : agendaItems) {
            System.out.println(agendaItem);
        }

		//CODE1.4:Sort the randomized AgendaItems using custom comparator
        Collections.sort(agendaItems, comparator);

		//CODE1.5:Print out SORTED AgendaItems
        System.out.println("After sort: ");
        for (AgendaItem agendaItem : agendaItems) {
            System.out.println(agendaItem);
        }
	}
}
