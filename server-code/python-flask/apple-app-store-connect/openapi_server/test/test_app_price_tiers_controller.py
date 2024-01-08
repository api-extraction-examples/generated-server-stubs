import unittest

from flask import json

from openapi_server.models.app_price_points_response import AppPricePointsResponse  # noqa: E501
from openapi_server.models.app_price_tier_response import AppPriceTierResponse  # noqa: E501
from openapi_server.models.app_price_tiers_response import AppPriceTiersResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppPriceTiersController(BaseTestCase):
    """AppPriceTiersController integration test stubs"""

    def test_app_price_tiers_get_collection(self):
        """Test case for app_price_tiers_get_collection

        
        """
        query_string = [('filter[id]', ['filter_id_example']),
                        ('fields[appPriceTiers]', ['fields_app_price_tiers_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[appPricePoints]', ['fields_app_price_points_example']),
                        ('limit[pricePoints]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPriceTiers',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_price_tiers_get_instance(self):
        """Test case for app_price_tiers_get_instance

        
        """
        query_string = [('fields[appPriceTiers]', ['fields_app_price_tiers_example']),
                        ('include', ['include_example']),
                        ('fields[appPricePoints]', ['fields_app_price_points_example']),
                        ('limit[pricePoints]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPriceTiers/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_price_tiers_price_points_get_to_many_related(self):
        """Test case for app_price_tiers_price_points_get_to_many_related

        
        """
        query_string = [('fields[appPricePoints]', ['fields_app_price_points_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPriceTiers/{id}/pricePoints'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
