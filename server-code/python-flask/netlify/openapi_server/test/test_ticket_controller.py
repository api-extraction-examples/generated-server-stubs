import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.ticket import Ticket  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTicketController(BaseTestCase):
    """TicketController integration test stubs"""

    def test_create_ticket(self):
        """Test case for create_ticket

        
        """
        query_string = [('client_id', 'client_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/oauth/tickets',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_show_ticket(self):
        """Test case for show_ticket

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/oauth/tickets/{ticket_id}'.format(ticket_id='ticket_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
