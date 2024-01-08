import unittest

from flask import json

from openapi_server.models.page_bean_string import PageBeanString  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLabelsController(BaseTestCase):
    """LabelsController integration test stubs"""

    def test_get_all_labels(self):
        """Test case for get_all_labels

        Get all labels
        """
        query_string = [('startAt', 0),
                        ('maxResults', 1000)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/label',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
