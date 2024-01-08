import unittest

from flask import json

from openapi_server.models.feedback import Feedback  # noqa: E501
from openapi_server.test import BaseTestCase


class Test4FeedbackController(BaseTestCase):
    """4FeedbackController integration test stubs"""

    def test_get_feedback(self):
        """Test case for get_feedback

        
        """
        headers = { 
            'authorization': 'authorization_example',
        }
        response = self.client.open(
            '/api/feedback/{feedback_id}'.format(feedback_id='feedback_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_send_feedback(self):
        """Test case for send_feedback

        
        """
        body = openapi_server.Feedback()
        headers = { 
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/feedback/submit',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
