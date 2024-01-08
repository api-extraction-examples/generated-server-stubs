import unittest

from flask import json

from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.beta_app_review_detail_response import BetaAppReviewDetailResponse  # noqa: E501
from openapi_server.models.beta_app_review_detail_update_request import BetaAppReviewDetailUpdateRequest  # noqa: E501
from openapi_server.models.beta_app_review_details_response import BetaAppReviewDetailsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBetaAppReviewDetailsController(BaseTestCase):
    """BetaAppReviewDetailsController integration test stubs"""

    def test_beta_app_review_details_app_get_to_one_related(self):
        """Test case for beta_app_review_details_app_get_to_one_related

        
        """
        query_string = [('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaAppReviewDetails/{id}/app'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_app_review_details_get_collection(self):
        """Test case for beta_app_review_details_get_collection

        
        """
        query_string = [('filter[app]', ['filter_app_example']),
                        ('fields[betaAppReviewDetails]', ['fields_beta_app_review_details_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaAppReviewDetails',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_app_review_details_get_instance(self):
        """Test case for beta_app_review_details_get_instance

        
        """
        query_string = [('fields[betaAppReviewDetails]', ['fields_beta_app_review_details_example']),
                        ('include', ['include_example']),
                        ('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaAppReviewDetails/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_app_review_details_update_instance(self):
        """Test case for beta_app_review_details_update_instance

        
        """
        beta_app_review_detail_update_request = {"data":{"attributes":{"demoAccountPassword":"demoAccountPassword","notes":"notes","contactEmail":"contactEmail","contactFirstName":"contactFirstName","demoAccountRequired":True,"demoAccountName":"demoAccountName","contactLastName":"contactLastName","contactPhone":"contactPhone"},"id":"id","type":"betaAppReviewDetails"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaAppReviewDetails/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(beta_app_review_detail_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
