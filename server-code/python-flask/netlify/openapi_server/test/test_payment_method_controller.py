import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.payment_method import PaymentMethod  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPaymentMethodController(BaseTestCase):
    """PaymentMethodController integration test stubs"""

    def test_list_payment_methods_for_user(self):
        """Test case for list_payment_methods_for_user

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/billing/payment_methods',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
