import unittest

from flask import json

from openapi_server.models.beta_app_review_submission_create_request import BetaAppReviewSubmissionCreateRequest  # noqa: E501
from openapi_server.models.beta_app_review_submission_response import BetaAppReviewSubmissionResponse  # noqa: E501
from openapi_server.models.beta_app_review_submissions_response import BetaAppReviewSubmissionsResponse  # noqa: E501
from openapi_server.models.build_response import BuildResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBetaAppReviewSubmissionsController(BaseTestCase):
    """BetaAppReviewSubmissionsController integration test stubs"""

    def test_beta_app_review_submissions_build_get_to_one_related(self):
        """Test case for beta_app_review_submissions_build_get_to_one_related

        
        """
        query_string = [('fields[builds]', ['fields_builds_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaAppReviewSubmissions/{id}/build'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_app_review_submissions_create_instance(self):
        """Test case for beta_app_review_submissions_create_instance

        
        """
        beta_app_review_submission_create_request = {"data":{"relationships":{"build":{"data":{"id":"id","type":"builds"}}},"type":"betaAppReviewSubmissions"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaAppReviewSubmissions',
            method='POST',
            headers=headers,
            data=json.dumps(beta_app_review_submission_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_app_review_submissions_get_collection(self):
        """Test case for beta_app_review_submissions_get_collection

        
        """
        query_string = [('filter[betaReviewState]', ['filter_beta_review_state_example']),
                        ('filter[build]', ['filter_build_example']),
                        ('fields[betaAppReviewSubmissions]', ['fields_beta_app_review_submissions_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[builds]', ['fields_builds_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaAppReviewSubmissions',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_app_review_submissions_get_instance(self):
        """Test case for beta_app_review_submissions_get_instance

        
        """
        query_string = [('fields[betaAppReviewSubmissions]', ['fields_beta_app_review_submissions_example']),
                        ('include', ['include_example']),
                        ('fields[builds]', ['fields_builds_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaAppReviewSubmissions/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
