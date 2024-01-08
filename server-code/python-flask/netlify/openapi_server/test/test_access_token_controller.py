import unittest

from flask import json

from openapi_server.models.access_token import AccessToken  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAccessTokenController(BaseTestCase):
    """AccessTokenController integration test stubs"""

    def test_exchange_ticket(self):
        """Test case for exchange_ticket

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/oauth/tickets/{ticket_id}/exchange'.format(ticket_id='ticket_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
