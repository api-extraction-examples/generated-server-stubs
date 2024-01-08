import unittest

from flask import json

from openapi_server.models.bundle_id_response import BundleIdResponse  # noqa: E501
from openapi_server.models.certificates_response import CertificatesResponse  # noqa: E501
from openapi_server.models.devices_response import DevicesResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.profile_create_request import ProfileCreateRequest  # noqa: E501
from openapi_server.models.profile_response import ProfileResponse  # noqa: E501
from openapi_server.models.profiles_response import ProfilesResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProfilesController(BaseTestCase):
    """ProfilesController integration test stubs"""

    def test_profiles_bundle_id_get_to_one_related(self):
        """Test case for profiles_bundle_id_get_to_one_related

        
        """
        query_string = [('fields[bundleIds]', ['fields_bundle_ids_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/profiles/{id}/bundleId'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_profiles_certificates_get_to_many_related(self):
        """Test case for profiles_certificates_get_to_many_related

        
        """
        query_string = [('fields[certificates]', ['fields_certificates_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/profiles/{id}/certificates'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_profiles_create_instance(self):
        """Test case for profiles_create_instance

        
        """
        profile_create_request = {"data":{"relationships":{"certificates":{"data":[{"id":"id","type":"certificates"},{"id":"id","type":"certificates"}]},"devices":{"data":[{"id":"id","type":"devices"},{"id":"id","type":"devices"}]},"bundleId":{"data":{"id":"id","type":"bundleIds"}}},"attributes":{"profileType":"IOS_APP_DEVELOPMENT","name":"name"},"type":"profiles"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/profiles',
            method='POST',
            headers=headers,
            data=json.dumps(profile_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_profiles_delete_instance(self):
        """Test case for profiles_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/profiles/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_profiles_devices_get_to_many_related(self):
        """Test case for profiles_devices_get_to_many_related

        
        """
        query_string = [('fields[devices]', ['fields_devices_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/profiles/{id}/devices'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_profiles_get_collection(self):
        """Test case for profiles_get_collection

        
        """
        query_string = [('filter[name]', ['filter_name_example']),
                        ('filter[profileState]', ['filter_profile_state_example']),
                        ('filter[profileType]', ['filter_profile_type_example']),
                        ('filter[id]', ['filter_id_example']),
                        ('sort', ['sort_example']),
                        ('fields[profiles]', ['fields_profiles_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[certificates]', ['fields_certificates_example']),
                        ('fields[devices]', ['fields_devices_example']),
                        ('fields[bundleIds]', ['fields_bundle_ids_example']),
                        ('limit[certificates]', 56),
                        ('limit[devices]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/profiles',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_profiles_get_instance(self):
        """Test case for profiles_get_instance

        
        """
        query_string = [('fields[profiles]', ['fields_profiles_example']),
                        ('include', ['include_example']),
                        ('fields[certificates]', ['fields_certificates_example']),
                        ('fields[devices]', ['fields_devices_example']),
                        ('fields[bundleIds]', ['fields_bundle_ids_example']),
                        ('limit[certificates]', 56),
                        ('limit[devices]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/profiles/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
