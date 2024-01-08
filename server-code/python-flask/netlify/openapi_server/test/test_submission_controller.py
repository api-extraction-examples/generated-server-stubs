import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.submission import Submission  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSubmissionController(BaseTestCase):
    """SubmissionController integration test stubs"""

    def test_delete_submission(self):
        """Test case for delete_submission

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/submissions/{submission_id}'.format(submission_id='submission_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_form_submission(self):
        """Test case for list_form_submission

        
        """
        query_string = [('query', 'query_example'),
                        ('page', 56),
                        ('per_page', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/submissions/{submission_id}'.format(submission_id='submission_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_form_submissions(self):
        """Test case for list_form_submissions

        
        """
        query_string = [('page', 56),
                        ('per_page', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/forms/{form_id}/submissions'.format(form_id='form_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_site_submissions(self):
        """Test case for list_site_submissions

        
        """
        query_string = [('page', 56),
                        ('per_page', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/submissions'.format(site_id='site_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
