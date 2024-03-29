import sys
from setuptools import setup, find_packages

NAME = "openapi_server"
VERSION = "1.0.0"

# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = [
    "connexion>=2.0.2",
    "swagger-ui-bundle>=0.0.2",
    "python_dateutil>=2.6.0"
]

setup(
    name=NAME,
    version=VERSION,
    description="httpbin.org",
    author_email="me@kennethreitz.org",
    url="",
    keywords=["OpenAPI", "httpbin.org"],
    install_requires=REQUIRES,
    packages=find_packages(),
    package_data={'': ['openapi/openapi.yaml']},
    include_package_data=True,
    entry_points={
        'console_scripts': ['openapi_server=openapi_server.__main__:main']},
    long_description="""\
    A simple HTTP Request &amp; Response Service.&lt;br/&gt; &lt;br/&gt; &lt;b&gt;Run locally: &lt;/b&gt; &lt;code&gt;$ docker run -p 80:80 kennethreitz/httpbin&lt;/code&gt;
    """
)

