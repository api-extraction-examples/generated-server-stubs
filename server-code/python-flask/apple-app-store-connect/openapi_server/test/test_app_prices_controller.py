import unittest

from flask import json

from openapi_server.models.app_price_response import AppPriceResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppPricesController(BaseTestCase):
    """AppPricesController integration test stubs"""

    def test_app_prices_get_instance(self):
        """Test case for app_prices_get_instance

        
        """
        query_string = [('fields[appPrices]', ['fields_app_prices_example']),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPrices/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
