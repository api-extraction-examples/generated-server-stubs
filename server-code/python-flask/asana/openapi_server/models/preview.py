from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Preview(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, fallback=None, footer=None, header=None, header_link=None, html_text=None, text=None, title=None, title_link=None):  # noqa: E501
        """Preview - a model defined in OpenAPI

        :param fallback: The fallback of this Preview.  # noqa: E501
        :type fallback: str
        :param footer: The footer of this Preview.  # noqa: E501
        :type footer: str
        :param header: The header of this Preview.  # noqa: E501
        :type header: str
        :param header_link: The header_link of this Preview.  # noqa: E501
        :type header_link: str
        :param html_text: The html_text of this Preview.  # noqa: E501
        :type html_text: str
        :param text: The text of this Preview.  # noqa: E501
        :type text: str
        :param title: The title of this Preview.  # noqa: E501
        :type title: str
        :param title_link: The title_link of this Preview.  # noqa: E501
        :type title_link: str
        """
        self.openapi_types = {
            'fallback': str,
            'footer': str,
            'header': str,
            'header_link': str,
            'html_text': str,
            'text': str,
            'title': str,
            'title_link': str
        }

        self.attribute_map = {
            'fallback': 'fallback',
            'footer': 'footer',
            'header': 'header',
            'header_link': 'header_link',
            'html_text': 'html_text',
            'text': 'text',
            'title': 'title',
            'title_link': 'title_link'
        }

        self._fallback = fallback
        self._footer = footer
        self._header = header
        self._header_link = header_link
        self._html_text = html_text
        self._text = text
        self._title = title
        self._title_link = title_link

    @classmethod
    def from_dict(cls, dikt) -> 'Preview':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Preview of this Preview.  # noqa: E501
        :rtype: Preview
        """
        return util.deserialize_model(dikt, cls)

    @property
    def fallback(self) -> str:
        """Gets the fallback of this Preview.

        Some fallback text to display if unable to display the full preview.  # noqa: E501

        :return: The fallback of this Preview.
        :rtype: str
        """
        return self._fallback

    @fallback.setter
    def fallback(self, fallback: str):
        """Sets the fallback of this Preview.

        Some fallback text to display if unable to display the full preview.  # noqa: E501

        :param fallback: The fallback of this Preview.
        :type fallback: str
        """

        self._fallback = fallback

    @property
    def footer(self) -> str:
        """Gets the footer of this Preview.

        Text to display in the footer.  # noqa: E501

        :return: The footer of this Preview.
        :rtype: str
        """
        return self._footer

    @footer.setter
    def footer(self, footer: str):
        """Sets the footer of this Preview.

        Text to display in the footer.  # noqa: E501

        :param footer: The footer of this Preview.
        :type footer: str
        """

        self._footer = footer

    @property
    def header(self) -> str:
        """Gets the header of this Preview.

        Text to display in the header.  # noqa: E501

        :return: The header of this Preview.
        :rtype: str
        """
        return self._header

    @header.setter
    def header(self, header: str):
        """Sets the header of this Preview.

        Text to display in the header.  # noqa: E501

        :param header: The header of this Preview.
        :type header: str
        """

        self._header = header

    @property
    def header_link(self) -> str:
        """Gets the header_link of this Preview.

        Where the header will link to.  # noqa: E501

        :return: The header_link of this Preview.
        :rtype: str
        """
        return self._header_link

    @header_link.setter
    def header_link(self, header_link: str):
        """Sets the header_link of this Preview.

        Where the header will link to.  # noqa: E501

        :param header_link: The header_link of this Preview.
        :type header_link: str
        """

        self._header_link = header_link

    @property
    def html_text(self) -> str:
        """Gets the html_text of this Preview.

        HTML formatted text for the body of the preview.  # noqa: E501

        :return: The html_text of this Preview.
        :rtype: str
        """
        return self._html_text

    @html_text.setter
    def html_text(self, html_text: str):
        """Sets the html_text of this Preview.

        HTML formatted text for the body of the preview.  # noqa: E501

        :param html_text: The html_text of this Preview.
        :type html_text: str
        """

        self._html_text = html_text

    @property
    def text(self) -> str:
        """Gets the text of this Preview.

        Text for the body of the preview.  # noqa: E501

        :return: The text of this Preview.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text: str):
        """Sets the text of this Preview.

        Text for the body of the preview.  # noqa: E501

        :param text: The text of this Preview.
        :type text: str
        """

        self._text = text

    @property
    def title(self) -> str:
        """Gets the title of this Preview.

        Text to display as the title.  # noqa: E501

        :return: The title of this Preview.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this Preview.

        Text to display as the title.  # noqa: E501

        :param title: The title of this Preview.
        :type title: str
        """

        self._title = title

    @property
    def title_link(self) -> str:
        """Gets the title_link of this Preview.

        Where to title will link to.  # noqa: E501

        :return: The title_link of this Preview.
        :rtype: str
        """
        return self._title_link

    @title_link.setter
    def title_link(self, title_link: str):
        """Sets the title_link of this Preview.

        Where to title will link to.  # noqa: E501

        :param title_link: The title_link of this Preview.
        :type title_link: str
        """

        self._title_link = title_link
