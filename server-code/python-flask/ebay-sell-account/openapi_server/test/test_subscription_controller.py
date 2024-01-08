import unittest

from flask import json

from openapi_server.models.subscription_response import SubscriptionResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSubscriptionController(BaseTestCase):
    """SubscriptionController integration test stubs"""

    def test_get_subscription(self):
        """Test case for get_subscription

        
        """
        query_string = [('limit', 'limit_example'),
                        ('continuation_token', 'continuation_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/subscription',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
