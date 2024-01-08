import unittest

from flask import json

from openapi_server.models.dealer import Dealer  # noqa: E501
from openapi_server.models.halified_dealers import HalifiedDealers  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDealerSearchController(BaseTestCase):
    """DealerSearchController integration test stubs"""

    def test_dealer_get(self):
        """Test case for dealer_get

        
        """
        query_string = [('fields', 'fields_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/dealer_tryout/v1/dealers/{dealer_id}'.format(dealer_id='GS0000275'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_dealers_get(self):
        """Test case for dealers_get

        
        """
        query_string = [('dealerIds', ['dealer_ids_example']),
                        ('latitude', 3.4),
                        ('longitude', 3.4),
                        ('radiusValue', 10),
                        ('radiusUnit', 'KM'),
                        ('countryIsoCode', 'country_iso_code_example'),
                        ('city', 'city_example'),
                        ('name', 'name_example'),
                        ('brand', 'brand_example'),
                        ('productGroup', 'product_group_example'),
                        ('activity', 'activity_example'),
                        ('fields', 'fields_example'),
                        ('page', 56),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/dealer_tryout/v1/dealers',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
