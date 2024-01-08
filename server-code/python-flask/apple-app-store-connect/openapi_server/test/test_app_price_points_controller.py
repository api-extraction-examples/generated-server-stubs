import unittest

from flask import json

from openapi_server.models.app_price_point_response import AppPricePointResponse  # noqa: E501
from openapi_server.models.app_price_points_response import AppPricePointsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.territory_response import TerritoryResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppPricePointsController(BaseTestCase):
    """AppPricePointsController integration test stubs"""

    def test_app_price_points_get_collection(self):
        """Test case for app_price_points_get_collection

        
        """
        query_string = [('filter[priceTier]', ['filter_price_tier_example']),
                        ('filter[territory]', ['filter_territory_example']),
                        ('fields[appPricePoints]', ['fields_app_price_points_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[territories]', ['fields_territories_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPricePoints',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_price_points_get_instance(self):
        """Test case for app_price_points_get_instance

        
        """
        query_string = [('fields[appPricePoints]', ['fields_app_price_points_example']),
                        ('include', ['include_example']),
                        ('fields[territories]', ['fields_territories_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPricePoints/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_price_points_territory_get_to_one_related(self):
        """Test case for app_price_points_territory_get_to_one_related

        
        """
        query_string = [('fields[territories]', ['fields_territories_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPricePoints/{id}/territory'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
