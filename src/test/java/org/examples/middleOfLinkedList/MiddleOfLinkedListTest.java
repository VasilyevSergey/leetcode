package org.examples.middleOfLinkedList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.examples.middleOfLinkedList.MiddleOfLinkedList.middleNode;

class MiddleOfLinkedListTest {

    @ParameterizedTest
    @MethodSource("generateData")
    void middleNodeTest(ListNode head, ListNode expectedMiddleNode) {
        ListNode middleNode = middleNode(head);
        assertThat(middleNode).isEqualTo(expectedMiddleNode);
    }

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(buildListNode(new int[]{1, 2, 3, 4, 5}), buildListNode(new int[]{3, 4, 5})),
                Arguments.of(buildListNode(new int[]{1, 2, 3, 4, 5, 6}), buildListNode(new int[]{4, 5, 6}))
        );
    }

    private static ListNode buildListNode(int[] values) {
        ListNode head = new ListNode(values[values.length - 1]);
        for (int i = values.length - 2; i >= 0; i--) {
            ListNode prevHead = head;
            head = new ListNode(values[i], prevHead);
        }
        return head;
    }
}