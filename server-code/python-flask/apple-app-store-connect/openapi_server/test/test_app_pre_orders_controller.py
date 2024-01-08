import unittest

from flask import json

from openapi_server.models.app_pre_order_create_request import AppPreOrderCreateRequest  # noqa: E501
from openapi_server.models.app_pre_order_response import AppPreOrderResponse  # noqa: E501
from openapi_server.models.app_pre_order_update_request import AppPreOrderUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppPreOrdersController(BaseTestCase):
    """AppPreOrdersController integration test stubs"""

    def test_app_pre_orders_create_instance(self):
        """Test case for app_pre_orders_create_instance

        
        """
        app_pre_order_create_request = {"data":{"relationships":{"app":{"data":{"id":"id","type":"apps"}}},"attributes":{"appReleaseDate":"2000-01-23"},"type":"appPreOrders"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPreOrders',
            method='POST',
            headers=headers,
            data=json.dumps(app_pre_order_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_pre_orders_delete_instance(self):
        """Test case for app_pre_orders_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPreOrders/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_pre_orders_get_instance(self):
        """Test case for app_pre_orders_get_instance

        
        """
        query_string = [('fields[appPreOrders]', ['fields_app_pre_orders_example']),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPreOrders/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_pre_orders_update_instance(self):
        """Test case for app_pre_orders_update_instance

        
        """
        app_pre_order_update_request = {"data":{"attributes":{"appReleaseDate":"2000-01-23"},"id":"id","type":"appPreOrders"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPreOrders/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(app_pre_order_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
