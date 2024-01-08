import unittest

from flask import json

from openapi_server.models.age_rating_declaration_response import AgeRatingDeclarationResponse  # noqa: E501
from openapi_server.models.app_category_response import AppCategoryResponse  # noqa: E501
from openapi_server.models.app_info_localizations_response import AppInfoLocalizationsResponse  # noqa: E501
from openapi_server.models.app_info_response import AppInfoResponse  # noqa: E501
from openapi_server.models.app_info_update_request import AppInfoUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppInfosController(BaseTestCase):
    """AppInfosController integration test stubs"""

    def test_app_infos_age_rating_declaration_get_to_one_related(self):
        """Test case for app_infos_age_rating_declaration_get_to_one_related

        
        """
        query_string = [('fields[ageRatingDeclarations]', ['fields_age_rating_declarations_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appInfos/{id}/ageRatingDeclaration'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_infos_app_info_localizations_get_to_many_related(self):
        """Test case for app_infos_app_info_localizations_get_to_many_related

        
        """
        query_string = [('filter[locale]', ['filter_locale_example']),
                        ('fields[appInfos]', ['fields_app_infos_example']),
                        ('fields[appInfoLocalizations]', ['fields_app_info_localizations_example']),
                        ('limit', 56),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appInfos/{id}/appInfoLocalizations'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_infos_get_instance(self):
        """Test case for app_infos_get_instance

        
        """
        query_string = [('fields[appInfos]', ['fields_app_infos_example']),
                        ('include', ['include_example']),
                        ('fields[ageRatingDeclarations]', ['fields_age_rating_declarations_example']),
                        ('fields[appCategories]', ['fields_app_categories_example']),
                        ('fields[appInfoLocalizations]', ['fields_app_info_localizations_example']),
                        ('limit[appInfoLocalizations]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appInfos/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_infos_primary_category_get_to_one_related(self):
        """Test case for app_infos_primary_category_get_to_one_related

        
        """
        query_string = [('fields[appCategories]', ['fields_app_categories_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appInfos/{id}/primaryCategory'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_infos_primary_subcategory_one_get_to_one_related(self):
        """Test case for app_infos_primary_subcategory_one_get_to_one_related

        
        """
        query_string = [('fields[appCategories]', ['fields_app_categories_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appInfos/{id}/primarySubcategoryOne'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_infos_primary_subcategory_two_get_to_one_related(self):
        """Test case for app_infos_primary_subcategory_two_get_to_one_related

        
        """
        query_string = [('fields[appCategories]', ['fields_app_categories_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appInfos/{id}/primarySubcategoryTwo'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_infos_secondary_category_get_to_one_related(self):
        """Test case for app_infos_secondary_category_get_to_one_related

        
        """
        query_string = [('fields[appCategories]', ['fields_app_categories_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appInfos/{id}/secondaryCategory'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_infos_secondary_subcategory_one_get_to_one_related(self):
        """Test case for app_infos_secondary_subcategory_one_get_to_one_related

        
        """
        query_string = [('fields[appCategories]', ['fields_app_categories_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appInfos/{id}/secondarySubcategoryOne'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_infos_secondary_subcategory_two_get_to_one_related(self):
        """Test case for app_infos_secondary_subcategory_two_get_to_one_related

        
        """
        query_string = [('fields[appCategories]', ['fields_app_categories_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appInfos/{id}/secondarySubcategoryTwo'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_infos_update_instance(self):
        """Test case for app_infos_update_instance

        
        """
        app_info_update_request = {"data":{"relationships":{"secondaryCategory":{"data":{"id":"id","type":"appCategories"}},"primaryCategory":{"data":{"id":"id","type":"appCategories"}},"secondarySubcategoryOne":{"data":{"id":"id","type":"appCategories"}},"primarySubcategoryTwo":{"data":{"id":"id","type":"appCategories"}},"secondarySubcategoryTwo":{"data":{"id":"id","type":"appCategories"}},"primarySubcategoryOne":{"data":{"id":"id","type":"appCategories"}}},"id":"id","type":"appInfos"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appInfos/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(app_info_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
