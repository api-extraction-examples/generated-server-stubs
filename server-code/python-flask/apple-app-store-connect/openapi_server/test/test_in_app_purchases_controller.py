import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.in_app_purchase_response import InAppPurchaseResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestInAppPurchasesController(BaseTestCase):
    """InAppPurchasesController integration test stubs"""

    def test_in_app_purchases_get_instance(self):
        """Test case for in_app_purchases_get_instance

        
        """
        query_string = [('fields[inAppPurchases]', ['fields_in_app_purchases_example']),
                        ('include', ['include_example']),
                        ('limit[apps]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/inAppPurchases/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
