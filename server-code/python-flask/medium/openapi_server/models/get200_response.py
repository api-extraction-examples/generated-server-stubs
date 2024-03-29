from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Get200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, developer=None, documentation=None, email=None, linkedin=None, name=None, twitter=None, website=None):  # noqa: E501
        """Get200Response - a model defined in OpenAPI

        :param developer: The developer of this Get200Response.  # noqa: E501
        :type developer: str
        :param documentation: The documentation of this Get200Response.  # noqa: E501
        :type documentation: str
        :param email: The email of this Get200Response.  # noqa: E501
        :type email: str
        :param linkedin: The linkedin of this Get200Response.  # noqa: E501
        :type linkedin: str
        :param name: The name of this Get200Response.  # noqa: E501
        :type name: str
        :param twitter: The twitter of this Get200Response.  # noqa: E501
        :type twitter: str
        :param website: The website of this Get200Response.  # noqa: E501
        :type website: str
        """
        self.openapi_types = {
            'developer': str,
            'documentation': str,
            'email': str,
            'linkedin': str,
            'name': str,
            'twitter': str,
            'website': str
        }

        self.attribute_map = {
            'developer': 'developer',
            'documentation': 'documentation',
            'email': 'email',
            'linkedin': 'linkedin',
            'name': 'name',
            'twitter': 'twitter',
            'website': 'website'
        }

        self._developer = developer
        self._documentation = documentation
        self._email = email
        self._linkedin = linkedin
        self._name = name
        self._twitter = twitter
        self._website = website

    @classmethod
    def from_dict(cls, dikt) -> 'Get200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The __get_200_response of this Get200Response.  # noqa: E501
        :rtype: Get200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def developer(self) -> str:
        """Gets the developer of this Get200Response.

        Full name of the API's developer  # noqa: E501

        :return: The developer of this Get200Response.
        :rtype: str
        """
        return self._developer

    @developer.setter
    def developer(self, developer: str):
        """Sets the developer of this Get200Response.

        Full name of the API's developer  # noqa: E501

        :param developer: The developer of this Get200Response.
        :type developer: str
        """

        self._developer = developer

    @property
    def documentation(self) -> str:
        """Gets the documentation of this Get200Response.

        Link to the Medium API's documentation  # noqa: E501

        :return: The documentation of this Get200Response.
        :rtype: str
        """
        return self._documentation

    @documentation.setter
    def documentation(self, documentation: str):
        """Sets the documentation of this Get200Response.

        Link to the Medium API's documentation  # noqa: E501

        :param documentation: The documentation of this Get200Response.
        :type documentation: str
        """

        self._documentation = documentation

    @property
    def email(self) -> str:
        """Gets the email of this Get200Response.

        Email ID of the developer  # noqa: E501

        :return: The email of this Get200Response.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email: str):
        """Sets the email of this Get200Response.

        Email ID of the developer  # noqa: E501

        :param email: The email of this Get200Response.
        :type email: str
        """

        self._email = email

    @property
    def linkedin(self) -> str:
        """Gets the linkedin of this Get200Response.

        LinkedIn Page URL  # noqa: E501

        :return: The linkedin of this Get200Response.
        :rtype: str
        """
        return self._linkedin

    @linkedin.setter
    def linkedin(self, linkedin: str):
        """Sets the linkedin of this Get200Response.

        LinkedIn Page URL  # noqa: E501

        :param linkedin: The linkedin of this Get200Response.
        :type linkedin: str
        """

        self._linkedin = linkedin

    @property
    def name(self) -> str:
        """Gets the name of this Get200Response.

        Full name of the API  # noqa: E501

        :return: The name of this Get200Response.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Get200Response.

        Full name of the API  # noqa: E501

        :param name: The name of this Get200Response.
        :type name: str
        """

        self._name = name

    @property
    def twitter(self) -> str:
        """Gets the twitter of this Get200Response.

        Twitter Profile URL  # noqa: E501

        :return: The twitter of this Get200Response.
        :rtype: str
        """
        return self._twitter

    @twitter.setter
    def twitter(self, twitter: str):
        """Sets the twitter of this Get200Response.

        Twitter Profile URL  # noqa: E501

        :param twitter: The twitter of this Get200Response.
        :type twitter: str
        """

        self._twitter = twitter

    @property
    def website(self) -> str:
        """Gets the website of this Get200Response.

        Link to the Medium API's website  # noqa: E501

        :return: The website of this Get200Response.
        :rtype: str
        """
        return self._website

    @website.setter
    def website(self, website: str):
        """Sets the website of this Get200Response.

        Link to the Medium API's website  # noqa: E501

        :param website: The website of this Get200Response.
        :type website: str
        """

        self._website = website
