import unittest

from flask import json

from openapi_server.models.complete_codename_lsit import CompleteCodenameLsit  # noqa: E501
from openapi_server.models.detailed_ordering_level_info import DetailedOrderingLevelInfo  # noqa: E501
from openapi_server.models.detailed_product_information import DetailedProductInformation  # noqa: E501
from openapi_server.models.product_listing_level_info import ProductListingLevelInfo  # noqa: E501
from openapi_server.models.unsuccessful_operation import UnsuccessfulOperation  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProductsController(BaseTestCase):
    """ProductsController integration test stubs"""

    def test_get_code_name(self):
        """Test case for get_code_name

        5. Get list of codename details for Intel products.
        """
        query_string = [('locale_geo_id', 'locale_geo_id_example')]
        headers = { 
            'Accept': '*/*',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'ClientId': 'special-key',
        }
        response = self.client.open(
            '/api/products/get-codename',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_product_info(self):
        """Test case for get_product_info

        2. Get complete product info with product id.
        """
        query_string = [('locale_geo_id', 'locale_geo_id_example'),
                        ('product_id', 'product_id_example'),
                        ('include_reference', 'include_reference_example')]
        headers = { 
            'Accept': '*/*',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'ClientId': 'special-key',
        }
        response = self.client.open(
            '/api/products/get-products-info',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_product_list(self):
        """Test case for get_product_list

        1. Find products by product id or category id
        """
        query_string = [('locale_geo_id', 'locale_geo_id_example'),
                        ('category_id', 'category_id_example'),
                        ('product_id', 'product_id_example'),
                        ('highlights', 'highlights_example'),
                        ('sort', 'sort_example'),
                        ('filters', 'filters_example'),
                        ('per_page', 56),
                        ('page_no', 56)]
        headers = { 
            'Accept': '*/*',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'ClientId': 'special-key',
        }
        response = self.client.open(
            '/api/products/get-products',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_getorderinginfo(self):
        """Test case for getorderinginfo

        3. Get ordering info for product id's requested.
        """
        query_string = [('product_id', 'product_id_example'),
                        ('locale_geo_id', 'locale_geo_id_example')]
        headers = { 
            'Accept': '*/*',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'ClientId': 'special-key',
        }
        response = self.client.open(
            '/api/products/get-ordering-info',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
