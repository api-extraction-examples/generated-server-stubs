import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.service_instance import ServiceInstance  # noqa: E501
from openapi_server.test import BaseTestCase


class TestServiceInstanceController(BaseTestCase):
    """ServiceInstanceController integration test stubs"""

    def test_create_service_instance(self):
        """Test case for create_service_instance

        
        """
        config = None
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/services/{addon}/instances'.format(site_id='site_id_example', addon='addon_example'),
            method='POST',
            headers=headers,
            data=json.dumps(config),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_service_instance(self):
        """Test case for delete_service_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/services/{addon}/instances/{instance_id}'.format(site_id='site_id_example', addon='addon_example', instance_id='instance_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_service_instances_for_site(self):
        """Test case for list_service_instances_for_site

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/service-instances'.format(site_id='site_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_show_service_instance(self):
        """Test case for show_service_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/services/{addon}/instances/{instance_id}'.format(site_id='site_id_example', addon='addon_example', instance_id='instance_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_service_instance(self):
        """Test case for update_service_instance

        
        """
        config = None
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/services/{addon}/instances/{instance_id}'.format(site_id='site_id_example', addon='addon_example', instance_id='instance_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(config),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
