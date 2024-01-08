import unittest

from flask import json

from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.bundle_id_capabilities_response import BundleIdCapabilitiesResponse  # noqa: E501
from openapi_server.models.bundle_id_create_request import BundleIdCreateRequest  # noqa: E501
from openapi_server.models.bundle_id_response import BundleIdResponse  # noqa: E501
from openapi_server.models.bundle_id_update_request import BundleIdUpdateRequest  # noqa: E501
from openapi_server.models.bundle_ids_response import BundleIdsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.profiles_response import ProfilesResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBundleIdsController(BaseTestCase):
    """BundleIdsController integration test stubs"""

    def test_bundle_ids_app_get_to_one_related(self):
        """Test case for bundle_ids_app_get_to_one_related

        
        """
        query_string = [('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/bundleIds/{id}/app'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bundle_ids_bundle_id_capabilities_get_to_many_related(self):
        """Test case for bundle_ids_bundle_id_capabilities_get_to_many_related

        
        """
        query_string = [('fields[bundleIdCapabilities]', ['fields_bundle_id_capabilities_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/bundleIds/{id}/bundleIdCapabilities'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bundle_ids_create_instance(self):
        """Test case for bundle_ids_create_instance

        
        """
        bundle_id_create_request = {"data":{"attributes":{"identifier":"identifier","seedId":"seedId","name":"name"},"type":"bundleIds"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/bundleIds',
            method='POST',
            headers=headers,
            data=json.dumps(bundle_id_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bundle_ids_delete_instance(self):
        """Test case for bundle_ids_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/bundleIds/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bundle_ids_get_collection(self):
        """Test case for bundle_ids_get_collection

        
        """
        query_string = [('filter[identifier]', ['filter_identifier_example']),
                        ('filter[name]', ['filter_name_example']),
                        ('filter[platform]', ['filter_platform_example']),
                        ('filter[seedId]', ['filter_seed_id_example']),
                        ('filter[id]', ['filter_id_example']),
                        ('sort', ['sort_example']),
                        ('fields[bundleIds]', ['fields_bundle_ids_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[bundleIdCapabilities]', ['fields_bundle_id_capabilities_example']),
                        ('fields[profiles]', ['fields_profiles_example']),
                        ('fields[apps]', ['fields_apps_example']),
                        ('limit[bundleIdCapabilities]', 56),
                        ('limit[profiles]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/bundleIds',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bundle_ids_get_instance(self):
        """Test case for bundle_ids_get_instance

        
        """
        query_string = [('fields[bundleIds]', ['fields_bundle_ids_example']),
                        ('include', ['include_example']),
                        ('fields[bundleIdCapabilities]', ['fields_bundle_id_capabilities_example']),
                        ('fields[profiles]', ['fields_profiles_example']),
                        ('fields[apps]', ['fields_apps_example']),
                        ('limit[bundleIdCapabilities]', 56),
                        ('limit[profiles]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/bundleIds/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bundle_ids_profiles_get_to_many_related(self):
        """Test case for bundle_ids_profiles_get_to_many_related

        
        """
        query_string = [('fields[profiles]', ['fields_profiles_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/bundleIds/{id}/profiles'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bundle_ids_update_instance(self):
        """Test case for bundle_ids_update_instance

        
        """
        bundle_id_update_request = {"data":{"attributes":{"name":"name"},"id":"id","type":"bundleIds"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/bundleIds/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(bundle_id_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
