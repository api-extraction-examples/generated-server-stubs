import unittest

from flask import json

from openapi_server.models.create_batch_request200_response import CreateBatchRequest200Response  # noqa: E501
from openapi_server.models.create_batch_request_request import CreateBatchRequestRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBatchAPIController(BaseTestCase):
    """BatchAPIController integration test stubs"""

    def test_create_batch_request(self):
        """Test case for create_batch_request

        Submit parallel requests
        """
        create_batch_request_request = openapi_server.CreateBatchRequestRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/batch',
            method='POST',
            headers=headers,
            data=json.dumps(create_batch_request_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
