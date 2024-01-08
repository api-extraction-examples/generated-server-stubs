import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.function import Function  # noqa: E501
from openapi_server.test import BaseTestCase


class TestFunctionController(BaseTestCase):
    """FunctionController integration test stubs"""

    @unittest.skip("application/octet-stream not supported by Connexion")
    def test_upload_deploy_function(self):
        """Test case for upload_deploy_function

        
        """
        file_body = '/path/to/file'
        query_string = [('runtime', 'runtime_example'),
                        ('size', 56)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/octet-stream',
            'x_nf_retry_count': 56,
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/deploys/{deploy_id}/functions/{name}'.format(deploy_id='deploy_id_example', name='name_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(file_body),
            content_type='application/octet-stream',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
