import unittest

from flask import json

from openapi_server.models.build_beta_detail_response import BuildBetaDetailResponse  # noqa: E501
from openapi_server.models.build_beta_detail_update_request import BuildBetaDetailUpdateRequest  # noqa: E501
from openapi_server.models.build_beta_details_response import BuildBetaDetailsResponse  # noqa: E501
from openapi_server.models.build_response import BuildResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBuildBetaDetailsController(BaseTestCase):
    """BuildBetaDetailsController integration test stubs"""

    def test_build_beta_details_build_get_to_one_related(self):
        """Test case for build_beta_details_build_get_to_one_related

        
        """
        query_string = [('fields[builds]', ['fields_builds_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/buildBetaDetails/{id}/build'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_build_beta_details_get_collection(self):
        """Test case for build_beta_details_get_collection

        
        """
        query_string = [('filter[build]', ['filter_build_example']),
                        ('filter[id]', ['filter_id_example']),
                        ('fields[buildBetaDetails]', ['fields_build_beta_details_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[builds]', ['fields_builds_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/buildBetaDetails',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_build_beta_details_get_instance(self):
        """Test case for build_beta_details_get_instance

        
        """
        query_string = [('fields[buildBetaDetails]', ['fields_build_beta_details_example']),
                        ('include', ['include_example']),
                        ('fields[builds]', ['fields_builds_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/buildBetaDetails/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_build_beta_details_update_instance(self):
        """Test case for build_beta_details_update_instance

        
        """
        build_beta_detail_update_request = {"data":{"attributes":{"autoNotifyEnabled":True},"id":"id","type":"buildBetaDetails"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/buildBetaDetails/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(build_beta_detail_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
