import unittest

from flask import json

from openapi_server.models.build_log_msg import BuildLogMsg  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBuildLogMsgController(BaseTestCase):
    """BuildLogMsgController integration test stubs"""

    def test_update_site_build_log(self):
        """Test case for update_site_build_log

        
        """
        msg = openapi_server.BuildLogMsg()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/builds/{build_id}/log'.format(build_id='build_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(msg),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
