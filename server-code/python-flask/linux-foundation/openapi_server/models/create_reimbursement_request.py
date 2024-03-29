from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.contact import Contact
from openapi_server import util

from openapi_server.models.contact import Contact  # noqa: E501

class CreateReimbursementRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, project_name=None, beneficiaries=None, categories=None, entity_type=None, owner=None, project_url=None):  # noqa: E501
        """CreateReimbursementRequest - a model defined in OpenAPI

        :param project_name: The project_name of this CreateReimbursementRequest.  # noqa: E501
        :type project_name: str
        :param beneficiaries: The beneficiaries of this CreateReimbursementRequest.  # noqa: E501
        :type beneficiaries: List[Contact]
        :param categories: The categories of this CreateReimbursementRequest.  # noqa: E501
        :type categories: List[str]
        :param entity_type: The entity_type of this CreateReimbursementRequest.  # noqa: E501
        :type entity_type: str
        :param owner: The owner of this CreateReimbursementRequest.  # noqa: E501
        :type owner: Contact
        :param project_url: The project_url of this CreateReimbursementRequest.  # noqa: E501
        :type project_url: str
        """
        self.openapi_types = {
            'project_name': str,
            'beneficiaries': List[Contact],
            'categories': List[str],
            'entity_type': str,
            'owner': Contact,
            'project_url': str
        }

        self.attribute_map = {
            'project_name': 'ProjectName',
            'beneficiaries': 'Beneficiaries',
            'categories': 'Categories',
            'entity_type': 'EntityType',
            'owner': 'Owner',
            'project_url': 'ProjectURL'
        }

        self._project_name = project_name
        self._beneficiaries = beneficiaries
        self._categories = categories
        self._entity_type = entity_type
        self._owner = owner
        self._project_url = project_url

    @classmethod
    def from_dict(cls, dikt) -> 'CreateReimbursementRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The createReimbursement_request of this CreateReimbursementRequest.  # noqa: E501
        :rtype: CreateReimbursementRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def project_name(self) -> str:
        """Gets the project_name of this CreateReimbursementRequest.


        :return: The project_name of this CreateReimbursementRequest.
        :rtype: str
        """
        return self._project_name

    @project_name.setter
    def project_name(self, project_name: str):
        """Sets the project_name of this CreateReimbursementRequest.


        :param project_name: The project_name of this CreateReimbursementRequest.
        :type project_name: str
        """
        if project_name is None:
            raise ValueError("Invalid value for `project_name`, must not be `None`")  # noqa: E501

        self._project_name = project_name

    @property
    def beneficiaries(self) -> List[Contact]:
        """Gets the beneficiaries of this CreateReimbursementRequest.


        :return: The beneficiaries of this CreateReimbursementRequest.
        :rtype: List[Contact]
        """
        return self._beneficiaries

    @beneficiaries.setter
    def beneficiaries(self, beneficiaries: List[Contact]):
        """Sets the beneficiaries of this CreateReimbursementRequest.


        :param beneficiaries: The beneficiaries of this CreateReimbursementRequest.
        :type beneficiaries: List[Contact]
        """

        self._beneficiaries = beneficiaries

    @property
    def categories(self) -> List[str]:
        """Gets the categories of this CreateReimbursementRequest.


        :return: The categories of this CreateReimbursementRequest.
        :rtype: List[str]
        """
        return self._categories

    @categories.setter
    def categories(self, categories: List[str]):
        """Sets the categories of this CreateReimbursementRequest.


        :param categories: The categories of this CreateReimbursementRequest.
        :type categories: List[str]
        """
        if categories is None:
            raise ValueError("Invalid value for `categories`, must not be `None`")  # noqa: E501

        self._categories = categories

    @property
    def entity_type(self) -> str:
        """Gets the entity_type of this CreateReimbursementRequest.


        :return: The entity_type of this CreateReimbursementRequest.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type: str):
        """Sets the entity_type of this CreateReimbursementRequest.


        :param entity_type: The entity_type of this CreateReimbursementRequest.
        :type entity_type: str
        """

        self._entity_type = entity_type

    @property
    def owner(self) -> Contact:
        """Gets the owner of this CreateReimbursementRequest.


        :return: The owner of this CreateReimbursementRequest.
        :rtype: Contact
        """
        return self._owner

    @owner.setter
    def owner(self, owner: Contact):
        """Sets the owner of this CreateReimbursementRequest.


        :param owner: The owner of this CreateReimbursementRequest.
        :type owner: Contact
        """
        if owner is None:
            raise ValueError("Invalid value for `owner`, must not be `None`")  # noqa: E501

        self._owner = owner

    @property
    def project_url(self) -> str:
        """Gets the project_url of this CreateReimbursementRequest.


        :return: The project_url of this CreateReimbursementRequest.
        :rtype: str
        """
        return self._project_url

    @project_url.setter
    def project_url(self, project_url: str):
        """Sets the project_url of this CreateReimbursementRequest.


        :param project_url: The project_url of this CreateReimbursementRequest.
        :type project_url: str
        """
        if project_url is None:
            raise ValueError("Invalid value for `project_url`, must not be `None`")  # noqa: E501

        self._project_url = project_url
