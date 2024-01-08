import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.form import Form  # noqa: E501
from openapi_server.test import BaseTestCase


class TestFormController(BaseTestCase):
    """FormController integration test stubs"""

    def test_delete_site_form(self):
        """Test case for delete_site_form

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/forms/{form_id}'.format(site_id='site_id_example', form_id='form_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_site_forms(self):
        """Test case for list_site_forms

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/forms'.format(site_id='site_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
