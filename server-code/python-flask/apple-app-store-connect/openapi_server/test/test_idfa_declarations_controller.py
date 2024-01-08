import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.idfa_declaration_create_request import IdfaDeclarationCreateRequest  # noqa: E501
from openapi_server.models.idfa_declaration_response import IdfaDeclarationResponse  # noqa: E501
from openapi_server.models.idfa_declaration_update_request import IdfaDeclarationUpdateRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIdfaDeclarationsController(BaseTestCase):
    """IdfaDeclarationsController integration test stubs"""

    def test_idfa_declarations_create_instance(self):
        """Test case for idfa_declarations_create_instance

        
        """
        idfa_declaration_create_request = {"data":{"relationships":{"appStoreVersion":{"data":{"id":"id","type":"appStoreVersions"}}},"attributes":{"attributesAppInstallationToPreviousAd":True,"attributesActionWithPreviousAd":True,"servesAds":True,"honorsLimitedAdTracking":True},"type":"idfaDeclarations"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/idfaDeclarations',
            method='POST',
            headers=headers,
            data=json.dumps(idfa_declaration_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_idfa_declarations_delete_instance(self):
        """Test case for idfa_declarations_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/idfaDeclarations/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_idfa_declarations_update_instance(self):
        """Test case for idfa_declarations_update_instance

        
        """
        idfa_declaration_update_request = {"data":{"attributes":{"attributesAppInstallationToPreviousAd":True,"attributesActionWithPreviousAd":True,"servesAds":True,"honorsLimitedAdTracking":True},"id":"id","type":"idfaDeclarations"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/idfaDeclarations/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(idfa_declaration_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
